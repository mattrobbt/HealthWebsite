const { assert } = require('chai');
const { degreesToRadians, calculateDistance } = require('../src/distances');

// Location fake objects for test use
const location1 = {
  lat: 50,
  lng: 60
};
const location2 = {
  lat: 72,
  lng: 46
};
const location3 = {
  lat: 70,
  lng: 50
};

describe('distances', () => {
  describe('degreesToRadians()', () => {
    it('degreesToRadians is defined', () => {
      assert.isDefined(degreesToRadians);
    });

    it('degreesToRadians returns a number', () => {
      const result = degreesToRadians(12);
      assert.isNumber(result, 'result is not a number');
    });

    it('0 degrees = 0 radians', () => {
      const result = degreesToRadians(0);
      assert.equal(0, result);
    });

    it('30 degrees = pi/6 radians', () => {
      const result = degreesToRadians(30);
      assert.equal(Math.PI / 6, result);
    });

    it('45 degrees = pi/4 radians', () => {
      const result = degreesToRadians(45);
      assert.equal(Math.PI / 4, result);
    });

    it('60 degrees = pi/3 radians', () => {
      const result = degreesToRadians(60);
      assert.equal(Math.PI / 3, result);
    });

    it('90 degrees = pi/2 radians', () => {
      const result = degreesToRadians(90);
      assert.equal(Math.PI / 2, result);
    });

    it('180 degrees = pi radians', () => {
      const result = degreesToRadians(180);
      assert.equal(Math.PI, result);
    });
  });

  describe('calculateDistance()', () => {
    it('is defined', () => {
      assert.isDefined(calculateDistance);
    });

    it('returns a number', () => {
      const result = calculateDistance(location1, location2);
      assert.isNumber(result);
    });

    it('distance from location1 to location 2 is 2545km', () => {
      const result = calculateDistance(location1, location2);
      assert.equal(result, 2545);
    });

    // TODO: rounded to nearest km, can increase accuracy in the future
    it('distance from location2 to location3 is 265km', () => {
      const result = calculateDistance(location2, location3);
      assert.equal(result, 265);
    });

    it('distance from location1 to location2 = location 2 to location 1', () => {
      const result1 = calculateDistance(location1, location2);
      const result2 = calculateDistance(location2, location1);

      assert.equal(result1, result2);
    });

    it("distances shouldn't be negative (< 0)", () => {
      const result = calculateDistance(location1, location3);
      assert.isAtLeast(result, 0);
    });
  });
});
