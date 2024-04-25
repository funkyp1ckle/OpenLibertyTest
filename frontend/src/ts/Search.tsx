import '../css/Data.css'
import {Icon} from "@iconify/react";

function Search() {
    return (
        <div className="search">
            <label>
                <input type="search" placeholder="Search" />
            </label>
            <button>
                <Icon className="iconify search-icon" icon="ic:round-search" />
            </button>
        </div>
    );
}

export default Search;