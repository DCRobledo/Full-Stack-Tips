import {useEffect, useState} from "react";
import Config from "./Config.ts";

const AppSingleton = () => {
    const [APIURL, setAPIURL] = useState('');

    useEffect(() => {
        const config = Config.getInstance();
        setAPIURL(config.APIURL);
    }, []);

    return (
        <div>
            API URL: {APIURL}
        </div>
    )
}

export default AppSingleton;