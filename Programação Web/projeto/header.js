// header.js
class Myheader extends HTMLElement {
    connectedCallback() {
        this.innerHTML = `
        <div id="header">
          <a href="https://www.facebook.com/Ibertrio" target="_blank"> <img src="/imagens/facebook.png" alt="icon facebook"></a>
        </div>
        `
    }
}
window.customElements.define('my-header', Myheader)