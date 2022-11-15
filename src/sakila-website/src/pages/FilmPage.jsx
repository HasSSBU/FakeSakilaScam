import React from 'react';
import ReactDOM from 'react-dom/client';
import { useParams } from 'react-router-dom';
import Head from '../homepage.js';
import GetFilm from '../SpecificFilmAPI.js';

function FilmPage(){
    let param = useParams();
    return(
        <div><GetFilm Id={param.Id}/> </div>
    );
}

export default FilmPage;