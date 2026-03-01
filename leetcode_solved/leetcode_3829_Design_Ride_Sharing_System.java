// Runtime 54 ms Beats 26.19% 
// Memory 48.38 MB Beats 62.35%
// Double-linked list or hashmap.
// T:O(n), S:O(n)
// 
class RideSharingSystem {
    LinkedHashMap<Integer, Integer> riders = new LinkedHashMap<>(), drivers = new LinkedHashMap<>();

    public RideSharingSystem() {
    }

    public void addRider(int riderId) {
        riders.put(riderId, riderId);
    }

    public void addDriver(int driverId) {
        drivers.put(driverId, driverId);
    }

    public int[] matchDriverWithRider() {
        if (drivers.isEmpty() || riders.isEmpty()) {
            return new int[]{-1, -1};
        }
        Map.Entry<Integer, Integer> firstEntry = riders.entrySet().iterator().next(), firstEntry2 = drivers.entrySet().iterator().next();
        riders.remove(firstEntry.getKey());
        drivers.remove(firstEntry2.getKey());

        return new int[]{firstEntry2.getKey(), firstEntry.getKey()};
    }

    public void cancelRider(int riderId) {
        riders.remove(riderId);
    }
}
