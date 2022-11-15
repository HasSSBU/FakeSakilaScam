import React from 'react';
import { useParams } from 'react-router-dom';
import GetFilm from '../SpecificFilmAPI.js';

function FilmPage(){
    let param = useParams();
    return(
        <div>
            <GetFilm Id={param.Id}/> 
        </div>
    );
}

export default FilmPage;