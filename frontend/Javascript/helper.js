let $button;
function bindEvents() {

    $button.on('click', addMessage.bind(this));
}

function cacheDOM() {

}

function init() {
    cacheDOM();
    bindEvents();
}

init();

