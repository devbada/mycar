package me.minam.car.form;

import lombok.*;
import me.minam.car.entity.Maintenance;
import me.minam.car.enumerate.MaintenanceType;

import java.util.List;

public class CarForm {
    public static class Request {

        @Getter
        @Setter
        @ToString
        @NoArgsConstructor
        @AllArgsConstructor
        @Builder(toBuilder = true)
        public static class Find {
            private Long id;
            private String nickName;
        }
    }

    public static class Response {

        @Getter
        @Setter
        @ToString
        @NoArgsConstructor
        @AllArgsConstructor
        public static class FindOne {
            private String nickName;

            @Singular
            private List<DriveHistory> driveHistories;

            @Data
            public static class DriveHistory {
                private int distance;
                private String description;
                private String drivenPlace;
            }

            @Singular
            private List<FuelChargeHistory> fuelChargeHistories;

            @Data
            public static class FuelChargeHistory {
                private int amount;
                private int distance;
                private int distanceBetween;
                private int efficiency;
                private int flow;
                private int unitPrice;

            }

            @Singular
            private List<Maintenance> maintenances;

            @Data
            public static class Maintenance {
                private int amount;
                private int distance;
                private MaintenanceType maintenanceType;
                private String description;
                private String shopName;
            }
        }
    }
}
