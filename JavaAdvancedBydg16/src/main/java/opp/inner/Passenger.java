package opp.inner;

public class Passenger implements Comparable<Passenger> {


    private String name;
    private int memberLevel; // 3 (platnium), 2 (gold), 1 (silver)
    private int memberDays;


    public Passenger(String name, int memberLevel, int memberDays) {
        this.name = name;
        rewardProgram.memberLevel = memberLevel;
        rewardProgram.memberDays = memberDays;
    }

    public RewardProgram getRewardProgram() {
        return rewardProgram;
    }

    @Override
    public int compareTo(Passenger p) {
        // <0 gdy this jest lepsze niż p
        int returnValue = rewardProgram.memberDays - this.memberLevel;

        if (returnValue == 0) {
            returnValue = rewardProgram.memberDays - this.memberDays;
        }

        return returnValue;
    }

    public static class RewardProgram{
        private int memberLevel;
        private int memberDays;

        public int getMemberLevel() {
            return memberLevel;
        }

        public void setMemberLevel(int memberLevel) {
            this.memberLevel = memberLevel;
        }

        public int getMemberDays() {
            return memberDays;
        }

        public void setMemberDays(int memberDays) {
            this.memberDays = memberDays;
        }
    }
    public RewardProgram rewardProgram = new RewardProgram();
}
