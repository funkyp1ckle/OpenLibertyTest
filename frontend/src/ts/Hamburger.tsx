import '../css/Hamburger.css'
import {ChangeEvent} from "react";

const handleClick = function(event : ChangeEvent<HTMLInputElement>) {
    if(event.target.checked) {

    }
}

function Hamburger() {
    return (
        <div className='Hamburger'>
            <input type='checkbox' id='burger-checkbox' name='burger-checkbox' onChange={handleClick}/>
            <label htmlFor='burger-checkbox'>
                <span></span>
                <span></span>
                <span></span>
            </label>
        </div>
    );
}

export default Hamburger;