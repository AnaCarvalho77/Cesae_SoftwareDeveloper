// footer.js
class Myfooter extends HTMLElement {
    connectedCallback() {
        this.innerHTML = `
        <hr>
        <p>© Ibertrio</p>
        `
    }
}
window.customElements.define('my-footer', Myfooter)