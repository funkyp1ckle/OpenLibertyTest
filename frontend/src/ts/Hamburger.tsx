import '../css/Hamburger.css'

function Hamburger() {
    return (
        <div className='Hamburger'>
            <input type='checkbox' id='burger-checkbox' name='burger-checkbox'/>
            <label htmlFor='burger-checkbox'>
                <span></span>
                <span></span>
                <span></span>
            </label>
        </div>
    );
}

export default Hamburger;