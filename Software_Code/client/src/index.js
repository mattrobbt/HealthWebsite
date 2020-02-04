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

const hideModal = modal => {
  console.log('calling.hideModal');
  if (modal) {
    modal.classList.add('hide');
    modal.classList.remove('show');
  }
};

// test exports
module.exports = {
  onClickShow: onClickShow,
  hideModal: hideModal
};

/* Set the width of the side navigation to 250px and the left margin of the page content to 250px */
function openNav() {
  document.getElementById("mySidenav").style.width = "250px";
  document.getElementById("main").style.marginLeft = "250px";
}

/* Set the width of the side navigation to 0 and the left margin of the page content to 0 */
function closeNav() {
  document.getElementById("mySidenav").style.width = "0";
  document.getElementById("main").style.marginLeft = "0";
}