import React from 'react';
import GetAllFilms from '../AllFilmsAPI.js';

function Home(){
    return(
        <div id="body">
            <GetAllFilms/>
        </div>
    );
}

export default Home;