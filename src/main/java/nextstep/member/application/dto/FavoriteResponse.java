package nextstep.member.application.dto;

import nextstep.subway.applicaion.dto.StationResponse;
import nextstep.member.domain.Favorite;

public class FavoriteResponse {

    private Long id;
    private StationResponse source;
    private StationResponse target;

    private FavoriteResponse() {
    }

    public FavoriteResponse(Long id, StationResponse source, StationResponse target) {
        this.id = id;
        this.source = source;
        this.target = target;
    }

    public static FavoriteResponse of(Favorite favorite) {
        return new FavoriteResponse(favorite.getId(),
            StationResponse.of(favorite.getSourceStation()),
            StationResponse.of(favorite.getTargetStation()));
    }

    public Long getId() {
        return id;
    }

    public StationResponse getSource() {
        return source;
    }

    public StationResponse getTarget() {
        return target;
    }
}
