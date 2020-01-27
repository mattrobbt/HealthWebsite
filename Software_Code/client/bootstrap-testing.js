const onClickShow = parentCard => {
  const showDiv = parentCard.querySelector(".collapse.show");
  showDiv.classList.remove(".collapse.show");
  showDiv.classList.add(".collapse");
  console.log("testing");
  const collapseDiv = parentCard.querySelector(".collapse");
  collapseDiv.classList.remove(".collapse");
  collapseDiv.classList.add(".collapse.show");
  console.log("testing2");
};
