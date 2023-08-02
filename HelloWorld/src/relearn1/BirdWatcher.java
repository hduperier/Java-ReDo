package relearn1;

class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        //throw new UnsupportedOperationException("Please implement the BirdCount.getLastWeek() method");
        return birdsPerDay;
    }

    public int getToday() {
        //throw new UnsupportedOperationException("Please implement the BirdCount.getToday() method");
        int today = birdsPerDay.length - 1;
        return birdsPerDay[today];
    }

    public void incrementTodaysCount() {
        //throw new UnsupportedOperationException("Please implement the BirdCount.incrementTodaysCount() method");
        int today = birdsPerDay.length - 1;
        birdsPerDay[today] = birdsPerDay[today] + 1;
    }

    public boolean hasDayWithoutBirds() {
        //throw new UnsupportedOperationException("Please implement the BirdCount.hasDayWithoutBirds() method");
        int count=0;
        for (int birds:birdsPerDay) {
            if (birds == 0) {
                count = count +1;
            }
        }
        if (count == 0) {
            return false;
        } else {
            return true;
        }
    }

    public int getCountForFirstDays(int numberOfDays) {
        //throw new UnsupportedOperationException("Please implement the BirdCount.getCountForFirstDays() method");
        int birdsC=0;
        if (numberOfDays > birdsPerDay.length) {
            numberOfDays = birdsPerDay.length;
        }
        
        for (int i=0; i<numberOfDays; i++) {
            int count = birdsPerDay[i];
            birdsC = birdsC + count;
        }
        return birdsC;
    }

    public int getBusyDays() {
        //throw new UnsupportedOperationException("Please implement the BirdCount.getBusyDays() method");
        int count=0;
        for (int i=0; i<birdsPerDay.length; i++) {
            if (birdsPerDay[i] > 4) {
                count = count+1;
            }
        }
        return count;
    }
}
