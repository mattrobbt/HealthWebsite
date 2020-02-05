const { assert } = require('chai');
const {
  sortLocations,
  calculateDistances,
  sortByDistance
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
let metaInfo = [
  {
    id: 1,
    location: {
      lat: 50,
      lng: 60
    },
    distance: undefined
  },
  {
    id: 2,
    location: {
      lat: 60,
      lng: 70
    },
    distance: undefined
  },
  {
    id: 3,
    location: {
      lat: 34,
      lng: 56
    },
    distance: undefined
  }
];

describe('sortByDistance', () => {
  describe('sortLocations', () => {
    it('should be defined', () => {
      assert.isDefined(sortLocations);
    });
  });

  describe('calculateDistances', () => {
    it('should be defined', () => {
      assert.isDefined(calculateDistances);
    });

    it('should populate the distances in metainfo array (none should be undefined)', () => {
      distances = calculateDistances(userLocation, metaInfo);

      for (let i = 0; i < metaInfo.length; i++) {
        assert.isDefined(metaInfo[i].distance);
      }
    });

    // TODO: add reverse to be able to sort both ways to reverse
    it('should be sortable in ascending order', () => {
      metaInfo = calculateDistances(userLocation, metaInfo);
      metaInfo = sortByDistance(metaInfo, true);
      for (let i = 0; i < metaInfo.length - 1; i++) {
        assert.isAtMost(metaInfo[i].distance, metaInfo[i + 1].distance);
      }
    });

    it('should be sortable in descending order', () => {
      metaInfo = calculateDistances(userLocation, metaInfo);
      metaInfo = sortByDistance(metaInfo, false);
      for (let i = 0; i < metaInfo.length - 1; i++) {
        assert.isAtLeast(metaInfo[i].distance, metaInfo[i + 1].distance);
      }
    });
  });
});
