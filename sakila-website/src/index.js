import React from 'react';
import ReactDOM from 'react-dom/client';
import GetAllFilms from './AllFilmsAPI.js';
import Head from './homepage.js';

const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(
  <React.StrictMode>
    <Head/>
    <GetAllFilms/>
  </React.StrictMode>
);
