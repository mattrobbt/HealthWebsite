const onClickShow = () => {
  /**
   * TODO: hardcoded to card1 -> add as param...
   */
  const parentCard = document.getElementById('card1');

  // get elements to show/hide
  const currentlyShowing = parentCard.querySelector('.showing-hidden');
  const currentlyHiding = parentCard.querySelector('.hide');

  // hiding currently showing
  currentlyShowing.classList.remove('showing-hidden');
  currentlyShowing.classList.add('hide');

  // showing currently hidden
  currentlyHiding.classList.remove('hide');
  currentlyHiding.classList.add('showing-hidden');
};
