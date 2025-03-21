class Config {
    private static instance: Config;
    public readonly APIURL: string;


    private constructor() 
    {
        this.APIURL = "https://youshouldhiredanielrobledo.com"
    }
    
    public static getInstance(): Config 
    {
        if (Config.instance == null)
        {
            Config.instance = new Config();
        }
        
        return Config.instance;
    }
}

export default Config;