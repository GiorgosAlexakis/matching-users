let $button;
function bindEvents() {

}

function cacheDOM() {

}

function init() {
    cacheDOM();
    bindEvents();
}
function bindEvents() {

    $button.on('click', addMessage.bind(this));
}
init();

