
// swaps .hide and .showing-hidden in children of parentCard
const onClickShow = parentCard => {
  const currentlyShowing = parentCard.querySelector('.showing-hidden');
  const currentlyHiding = parentCard.querySelector('.hide');

  if (currentlyShowing) {
    currentlyShowing.classList.replace('showing-hidden', 'hide');
  }

  if (currentlyHiding) {
    currentlyHiding.classList.replace('hide', 'showing-hidden');
  }
};

// test exports
module.exports = onClickShow;


