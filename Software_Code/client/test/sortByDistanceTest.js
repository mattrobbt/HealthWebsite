const { assert } = require('chai');
const {
  sortLocations,
  calculateDistances,
  sortDistances
} = require('../src/distances');

/**
 * Tests for src/distances are over two files, due to a slight inconvenience with includes
 */

// fake user location
let userLocation = {
  lat: 40,
  lng: 67
};

// fake locations to be sorted
let locations = [
  {
    id: 1,
    location: {
      lat: 50,
      lng: 60
    }
  },
  {
    id: 2,
    location: {
      lat: 60,
      lng: 70
    }
  },
  {
    id: 3,
    location: {
      lat: 34,
      lng: 56
    }
  }
];

// output variable
let distances = [];

describe('sortByDistance', () => {
  describe('sortLocations', () => {
    it('should be defined', () => {
      assert.isDefined(sortLocations);
    });

    describe('calculateDistances', () => {
      it('should be defined', () => {
        assert.isDefined(calculateDistances);
      });

      it('should populate the distances array (length should = locations.length)', () => {
        distances = calculateDistances(userLocation, locations);
        assert.equal(distances.length, locations.length);
      });

      // TODO: add reverse to be able to sort both ways to reverse
      it('should be sortable in ascending order', () => {
        distances = calculateDistances(userLocation, locations);
        distances = sortDistances(distances, true);
        for (let i = 0; i < distances.length - 1; i++) {
          assert.isAtMost(distances[i], distances[i + 1]);
        }
      });

      it('should be sortable in descending order', () => {
        distances = calculateDistances(userLocation, locations);
        distances = sortDistances(distances, false);
        for (let i = 0; i < distances.length - 1; i++) {
          assert.isAtLeast(distances[i], distances[i + 1]);
        }
      });
    });
  });
});
