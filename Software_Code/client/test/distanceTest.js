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
  });
});
