package co.uk.objectivity.microservice.services.impl;

import co.uk.objectivity.microservice.services.BallService;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class VolleyballServiceImpl implements BallService {
    @Override
    public void hitBall() {
      log.info("Volleyball hit");
    }
}
