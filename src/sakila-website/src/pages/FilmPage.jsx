import React from 'react';
import { useParams } from 'react-router-dom';
import GetFilm from '../SpecificFilmAPI.js';
import '../index.css';

function FilmPage(){
    let Param = useParams();
    return(
        <div>
            <GetFilm Id={Param.Id}/> 
        </div>
    );
}

export default FilmPage;