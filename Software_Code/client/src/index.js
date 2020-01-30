
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

const hideModal = modelId => {
  console.log('calling.hideModal');
  const temp = document.getElementById(modelId);
  if(temp){
    temp.classList.add('hide');
    //temp.classList.remove('fade');
    temp.classList.remove('show');
    
  }
}

// test exports
module.exports = onClickShow;


