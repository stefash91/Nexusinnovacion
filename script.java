const btnMenu = document.getElementById('menu-toggle');
const listaMenu = document.getElementById('menu-lista');

btnMenu.addEventListener('click', () => {
    listaMenu.classList.toggle('show'); // Si tiene 'show' se la quita, si no, se la pone
});