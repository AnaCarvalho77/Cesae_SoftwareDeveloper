// footer.js
class Myfooter extends HTMLElement {
    connectedCallback() {
        this.innerHTML = `
        
        <p>© Ibertrio</p>
        `
    }
}
window.customElements.define('my-footer', Myfooter)