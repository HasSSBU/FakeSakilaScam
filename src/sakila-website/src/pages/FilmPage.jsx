import React from 'react';
import { useParams } from 'react-router-dom';
import GetFilm from '../SpecificFilmAPI.js';

function FilmPage(){
    let Param = useParams();
    return(
        <div>
            <GetFilm Id={Param.Id}/> 
        </div>
    );
}

export default FilmPage;