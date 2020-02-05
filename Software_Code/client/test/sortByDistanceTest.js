const { assert } = require('chai');
const sortLocations = require('../src/sortByDistance');

let userLocation = {
  lat: 40,
  lng: 67
};

// example locations array
let locations = [
  {
    id: 1,
    lat: 50,
    lng: 60
  },
  {
    id: 2,
    lat: 60,
    lng: 70
  },
  {
    id: 3,
    lat: 50,
    lng: 60
  }
];

// output variable
let distances = [];

describe('sortByDistance', () => {
  describe('sortLocations', () => {
    it('should be defined', () => {
      sortLocations();
    });
  });
});
