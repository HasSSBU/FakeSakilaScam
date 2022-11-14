import React from 'react';
import { BrowserRouter, Route, Link } from 'react-router-dom';

const NavBar = () => {
    return(
        <nav>
            <ul>
                <li>
                    <Link to="/">Home</Link>
                </li>
                <li>
                    <Link to="/FilmPage">FilmPage</Link>
                </li>
                <li>
                    <Link to="/PaymentPage">PaymentPage</Link>
                </li>
            </ul>
        </nav>
    );
}

export default NavBar;