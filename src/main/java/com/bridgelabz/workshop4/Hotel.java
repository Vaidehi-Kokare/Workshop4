package com.bridgelabz.workshop4;

public class Hotel {
    public class Hotels {
        private String hotelName;
        private int regularWeekdayRate;
        private int regularWeekendRate;
        private int rewardWeekdayRate;
        private int rewardWeekendRate;
        private int ratings;

        Hotels(){

        }

        public Hotels(String hotelName, int regularWeekdayRate, int regularWeekendRate, int rewardWeekdayRate, int rewardWeekendRate, int ratings) {
            this.hotelName = hotelName;
            this.regularWeekdayRate = regularWeekdayRate;
            this.regularWeekendRate = regularWeekendRate;
            this.rewardWeekdayRate = rewardWeekdayRate;
            this.rewardWeekendRate = rewardWeekendRate;
            this.ratings = ratings;
        }

        public String getHotelName() {
            return hotelName;
        }

        public void setHotelName(String hotelName) {
            this.hotelName = hotelName;
        }

        public int getRegularWeekdayRate() {
            return regularWeekdayRate;
        }

        public void setRegularWeekdayRate(int regularWeekdayRate) {
            this.regularWeekdayRate = regularWeekdayRate;
        }

        public int getRegularWeekendRate() {
            return regularWeekendRate;
        }

        public void setRegularWeekendRate(int regularWeekendRate) {
            this.regularWeekendRate = regularWeekendRate;
        }

        public int getRewardWeekdayRate() {
            return rewardWeekdayRate;
        }

        public void setRewardWeekdayRate(int rewardWeekdayRate) {
            this.rewardWeekdayRate = rewardWeekdayRate;
        }

        public int getRewardWeekendRate() {
            return rewardWeekendRate;
        }

        public void setRewardWeekendRate(int rewardWeekendRate) {
            this.rewardWeekendRate = rewardWeekendRate;
        }

        public int getRatings() {
            return ratings;
        }

        public void setRatings(int ratings) {
            this.ratings = ratings;
        }
    }
}
