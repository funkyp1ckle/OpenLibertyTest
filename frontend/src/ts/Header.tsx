import Hamburger from "./Hamburger";
import '../css/Header.css';
import logo from '../assets/logo.png';
import profilePicture from '../assets/ProfilePhoto.jpg';

function Header() {
    return (
        <header>
            <Hamburger/>
            <img src={logo} alt='Logo' id='logo'/>
            <img src={profilePicture} alt='Profile' id='profile-picture'/>
        </header>
    );
}

export default Header;