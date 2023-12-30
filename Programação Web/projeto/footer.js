// footer.js
class Myfooter extends HTMLElement {
    connectedCallback() {
        this.innerHTML = `
        <p><a href="mailto:ibertrio@gmail.com" target="_blank">ibertrio@gmail.com</a></p>
        <br>
        <p>© Ibertrio</p>
        `
    }
}
window.customElements.define('my-footer', Myfooter)