const { assert } = require('chai');
const { JSDOM } = require('jsdom');
const { onClickShow, hideModal } = require('../src/index');

// importing jsdom to have access to dom elements for testing
const { document } = new JSDOM(`...`).window;

describe('index.js', () => {
  describe('onClickShow()', () => {
    it('element with .hide should have .showing-hidden after onClickShow()', () => {
      const element = document.createElement('div');
      element.classList.add('card');
      element.innerHTML =
        '<div class="hide" id="1"></div><div class="showing-hidden" id="2"></div>';

      onClickShow(element);

      element.removeChild(element.childNodes[1]);

      assert.equal(
        element.innerHTML,
        '<div class="showing-hidden" id="1"></div>'
      );
    });

    it('element with .showing-hidden should have .hide after onClickShow()', () => {
      const element = document.createElement('div');
      element.classList.add('card');
      element.innerHTML =
        '<div class="hide" id="1"></div><div class="showing-hidden" id="2"></div>';

      onClickShow(element);

      element.removeChild(element.childNodes[0]);

      assert.equal(element.innerHTML, '<div class="hide" id="2"></div>');
    });

    it('element that only has .hide shouldnt crash onClickShow()', () => {
      const element = document.createElement('div');
      element.classList.add('card');
      element.innerHTML = '<div class="hide" id="1"></div>';

      onClickShow(element);
    });

    it('element that only has .showing-hidden shouldnt crash onClickShow()', () => {
      const element = document.createElement('div');
      element.classList.add('card');
      element.innerHTML = '<div class="showing-hidden" id="1"></div>';

      onClickShow(element);
    });
  });

  describe('hideModal()', () => {
    it('correctly adds .hide', () => {
      const element = document.createElement('div');
      element.classList.add('modal', 'show');

      hideModal(element);

      const hideInClassList = element.classList.contains('hide');

      assert.isTrue(hideInClassList);
    });
    it('correctly removes .show', () => {
      const element = document.createElement('div');
      element.classList.add('modal', 'show');

      hideModal(element);

      const showInClassList = element.classList.contains('show');

      assert.isFalse(showInClassList);
    });
    it('doesnt crash when non-existing element is passed to it as a param', () => {
      const element = document.createElement('div');

      element.classList.add('modal', 'show');

      hideModal(element);
    });
  });
});
