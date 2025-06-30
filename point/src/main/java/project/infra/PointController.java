package project.infra;

import java.util.Optional;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.Date;
import project.domain.*;

//<<< Clean Arch / Inbound Adaptor

@RestController
@RequestMapping(value="/points")
@Transactional
public class PointController {

    @Autowired
    PointRepository pointRepository;

    @PutMapping("/{userId}/pluspoints")
    public Point addPoints(
        @PathVariable Long userId,
        @RequestParam("points") Integer points
    ) {
        // 최신 포인트 합계 조회
        Long currentSum = 0L;
        Point latest = pointRepository.findLatestByUserId(userId);
        if (latest != null) {
            currentSum = latest.getPointSum();
        }

        // 새 포인트 로그 생성
        Point point = new Point();
        point.setUserId(userId);
        point.setChangeDate(new Date());
        point.setChangePoint(points); // 양수
        point.setPointSum(currentSum + points);
        point.setReason("수동 충전");

        return pointRepository.save(point);
    }
}
//>>> Clean Arch / Inbound Adaptor
