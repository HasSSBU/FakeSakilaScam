import React from 'react';
import { useLocation, useParams } from 'react-router-dom';
import ScamBody from '../ScamReveal';
import '../index.css';

function EndPage(){
    let Param = useParams();
    let Location = useLocation();
    let Input = Location.state;
    console.log(Input);
    return(
        <div>
            <ScamBody  Id={Param.Id} Input={Input}/>
        </div>
    );
}

export default EndPage;