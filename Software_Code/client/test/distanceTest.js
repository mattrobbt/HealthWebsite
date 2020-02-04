const { assert } = require('chai');
const degreesToRadians = require('../src/distances');

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
      assert.isDefined(calculateDistance());
    });
  });
});
