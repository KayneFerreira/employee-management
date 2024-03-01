import React from 'react'
import './styles.css'

const Navbar = () => {
  return (
    <header className="header">
      <a href="/" className="logo">Logo</a>

      <nav className='navbar'>
        <a href="/">Home</a>
        <a href="#">Serviços</a>
        <a href="/registros">Registros</a>
        <a href="#">Contato</a>
        <a href="#">Sobre</a>
      </nav>
    </header>
  );
}

export default Navbar