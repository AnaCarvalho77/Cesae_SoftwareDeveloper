class Myslideshow extends HTMLElement {
    connectedCallback() {
        const script = document.createElement('script');
        script.textContent = `

        let slideIndex = 0;
        showSlides();


        function showSlides() {
          let i;
          let slides = document.getElementsByClassName("mySlides");
          for (i = 0; i < slides.length; i++) {
            slides[i].style.display = "none";
          }
          slideIndex++;
          if (slideIndex > slides.length) { slideIndex = 1 }
          slides[slideIndex - 1].style.display = "block";
          setTimeout(showSlides, 8000); 
        }
       `;

        this.appendChild(script);
    }
}
window.customElements.define('my-slideshow', Myslideshow)