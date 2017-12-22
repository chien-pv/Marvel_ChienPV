package com.fstyle.androidtrainning.data.model;

import java.io.Serializable;
import java.util.List;

/**
 * Created by framgia on 15/12/2017.
 */

public class CharacterItem implements Serializable {
    /**
     * id : 1011334
     * name : 3-D Man
     * description :
     * modified : 2014-04-29T14:18:17-0400
     * thumbnail : {"path":"http://i.annihil.us/u/prod/marvel/i/mg/c/e0/535fecbbb9784","extension":"jpg"}
     * resourceURI : http://gateway.marvel.com/v1/public/characters/1011334
     * comics : {"available":12,"collectionURI":"http://gateway.marvel.com/v1/public/characters/1011334/comics","items":[{"resourceURI":"http://gateway.marvel.com/v1/public/comics/21366","name":"Avengers: The Initiative (2007) #14"},{"resourceURI":"http://gateway.marvel.com/v1/public/comics/24571","name":"Avengers: The Initiative (2007) #14 (SPOTLIGHT VARIANT)"},{"resourceURI":"http://gateway.marvel.com/v1/public/comics/21546","name":"Avengers: The Initiative (2007) #15"},{"resourceURI":"http://gateway.marvel.com/v1/public/comics/21741","name":"Avengers: The Initiative (2007) #16"},{"resourceURI":"http://gateway.marvel.com/v1/public/comics/21975","name":"Avengers: The Initiative (2007) #17"},{"resourceURI":"http://gateway.marvel.com/v1/public/comics/22299","name":"Avengers: The Initiative (2007) #18"},{"resourceURI":"http://gateway.marvel.com/v1/public/comics/22300","name":"Avengers: The Initiative (2007) #18 (ZOMBIE VARIANT)"},{"resourceURI":"http://gateway.marvel.com/v1/public/comics/22506","name":"Avengers: The Initiative (2007) #19"},{"resourceURI":"http://gateway.marvel.com/v1/public/comics/8500","name":"Deadpool (1997) #44"},{"resourceURI":"http://gateway.marvel.com/v1/public/comics/10223","name":"Marvel Premiere (1972) #35"},{"resourceURI":"http://gateway.marvel.com/v1/public/comics/10224","name":"Marvel Premiere (1972) #36"},{"resourceURI":"http://gateway.marvel.com/v1/public/comics/10225","name":"Marvel Premiere (1972) #37"}],"returned":12}
     * series : {"available":3,"collectionURI":"http://gateway.marvel.com/v1/public/characters/1011334/series","items":[{"resourceURI":"http://gateway.marvel.com/v1/public/series/1945","name":"Avengers: The Initiative (2007 - 2010)"},{"resourceURI":"http://gateway.marvel.com/v1/public/series/2005","name":"Deadpool (1997 - 2002)"},{"resourceURI":"http://gateway.marvel.com/v1/public/series/2045","name":"Marvel Premiere (1972 - 1981)"}],"returned":3}
     * stories : {"available":21,"collectionURI":"http://gateway.marvel.com/v1/public/characters/1011334/stories","items":[{"resourceURI":"http://gateway.marvel.com/v1/public/stories/19947","name":"Cover #19947","type":"cover"},{"resourceURI":"http://gateway.marvel.com/v1/public/stories/19948","name":"The 3-D Man!","type":"interiorStory"},{"resourceURI":"http://gateway.marvel.com/v1/public/stories/19949","name":"Cover #19949","type":"cover"},{"resourceURI":"http://gateway.marvel.com/v1/public/stories/19950","name":"The Devil's Music!","type":"interiorStory"},{"resourceURI":"http://gateway.marvel.com/v1/public/stories/19951","name":"Cover #19951","type":"cover"},{"resourceURI":"http://gateway.marvel.com/v1/public/stories/19952","name":"Code-Name:  The Cold Warrior!","type":"interiorStory"},{"resourceURI":"http://gateway.marvel.com/v1/public/stories/47184","name":"AVENGERS: THE INITIATIVE (2007) #14","type":"cover"},{"resourceURI":"http://gateway.marvel.com/v1/public/stories/47185","name":"Avengers: The Initiative (2007) #14 - Int","type":"interiorStory"},{"resourceURI":"http://gateway.marvel.com/v1/public/stories/47498","name":"AVENGERS: THE INITIATIVE (2007) #15","type":"cover"},{"resourceURI":"http://gateway.marvel.com/v1/public/stories/47499","name":"Avengers: The Initiative (2007) #15 - Int","type":"interiorStory"},{"resourceURI":"http://gateway.marvel.com/v1/public/stories/47792","name":"AVENGERS: THE INITIATIVE (2007) #16","type":"cover"},{"resourceURI":"http://gateway.marvel.com/v1/public/stories/47793","name":"Avengers: The Initiative (2007) #16 - Int","type":"interiorStory"},{"resourceURI":"http://gateway.marvel.com/v1/public/stories/48361","name":"AVENGERS: THE INITIATIVE (2007) #17","type":"cover"},{"resourceURI":"http://gateway.marvel.com/v1/public/stories/48362","name":"Avengers: The Initiative (2007) #17 - Int","type":"interiorStory"},{"resourceURI":"http://gateway.marvel.com/v1/public/stories/49103","name":"AVENGERS: THE INITIATIVE (2007) #18","type":"cover"},{"resourceURI":"http://gateway.marvel.com/v1/public/stories/49104","name":"Avengers: The Initiative (2007) #18 - Int","type":"interiorStory"},{"resourceURI":"http://gateway.marvel.com/v1/public/stories/49106","name":"Avengers: The Initiative (2007) #18, Zombie Variant - Int","type":"interiorStory"},{"resourceURI":"http://gateway.marvel.com/v1/public/stories/49888","name":"AVENGERS: THE INITIATIVE (2007) #19","type":"cover"},{"resourceURI":"http://gateway.marvel.com/v1/public/stories/49889","name":"Avengers: The Initiative (2007) #19 - Int","type":"interiorStory"},{"resourceURI":"http://gateway.marvel.com/v1/public/stories/54371","name":"Avengers: The Initiative (2007) #14, Spotlight Variant - Int","type":"interiorStory"}],"returned":20}
     * events : {"available":1,"collectionURI":"http://gateway.marvel.com/v1/public/characters/1011334/events","items":[{"resourceURI":"http://gateway.marvel.com/v1/public/events/269","name":"Secret Invasion"}],"returned":1}
     * urls : [{"type":"detail","url":"http://marvel.com/characters/74/3-d_man?utm_campaign=apiRef&utm_source=7a4ee917fb53941ccc691445dac51ef7"},{"type":"wiki","url":"http://marvel.com/universe/3-D_Man_(Chandler)?utm_campaign=apiRef&utm_source=7a4ee917fb53941ccc691445dac51ef7"},{"type":"comiclink","url":"http://marvel.com/comics/characters/1011334/3-d_man?utm_campaign=apiRef&utm_source=7a4ee917fb53941ccc691445dac51ef7"}]
     */

    private int id;
    private String name;
    private String description;
    private String modified;
    private String resourceURI;
    private SeriesBean series;
    private StoriesBean stories;
    private EventsBean events;
    private List<UrlsBean> urls;
    private ThumbnailBean thumbnail;
    private ComicsBean comics;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getModified() {
        return modified;
    }

    public void setModified(String modified) {
        this.modified = modified;
    }

    public ThumbnailBean getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(ThumbnailBean thumbnail) {
        this.thumbnail = thumbnail;
    }

    public String getResourceURI() {
        return resourceURI;
    }

    public void setResourceURI(String resourceURI) {
        this.resourceURI = resourceURI;
    }

    public ComicsBean getComics() {
        return comics;
    }

    public void setComics(ComicsBean comics) {
        this.comics = comics;
    }

    public SeriesBean getSeries() {
        return series;
    }

    public void setSeries(SeriesBean series) {
        this.series = series;
    }

    public StoriesBean getStories() {
        return stories;
    }

    public void setStories(StoriesBean stories) {
        this.stories = stories;
    }

    public EventsBean getEvents() {
        return events;
    }

    public void setEvents(EventsBean events) {
        this.events = events;
    }

    public List<UrlsBean> getUrls() {
        return urls;
    }

    public void setUrls(List<UrlsBean> urls) {
        this.urls = urls;
    }

    public static class ThumbnailBean implements Serializable {
        /**
         * path : http://i.annihil.us/u/prod/marvel/i/mg/c/e0/535fecbbb9784
         * extension : jpg
         */

        private String path;
        private String extension;

        public String getPath() {
            return path;
        }

        public void setPath(String path) {
            this.path = path;
        }

        public String getExtension() {
            return extension;
        }

        public void setExtension(String extension) {
            this.extension = extension;
        }
    }

    public static class ComicsBean implements Serializable {
        /**
         * available : 12
         * collectionURI : http://gateway.marvel.com/v1/public/characters/1011334/comics
         * items : [{"resourceURI":"http://gateway.marvel.com/v1/public/comics/21366","name":"Avengers: The Initiative (2007) #14"},{"resourceURI":"http://gateway.marvel.com/v1/public/comics/24571","name":"Avengers: The Initiative (2007) #14 (SPOTLIGHT VARIANT)"},{"resourceURI":"http://gateway.marvel.com/v1/public/comics/21546","name":"Avengers: The Initiative (2007) #15"},{"resourceURI":"http://gateway.marvel.com/v1/public/comics/21741","name":"Avengers: The Initiative (2007) #16"},{"resourceURI":"http://gateway.marvel.com/v1/public/comics/21975","name":"Avengers: The Initiative (2007) #17"},{"resourceURI":"http://gateway.marvel.com/v1/public/comics/22299","name":"Avengers: The Initiative (2007) #18"},{"resourceURI":"http://gateway.marvel.com/v1/public/comics/22300","name":"Avengers: The Initiative (2007) #18 (ZOMBIE VARIANT)"},{"resourceURI":"http://gateway.marvel.com/v1/public/comics/22506","name":"Avengers: The Initiative (2007) #19"},{"resourceURI":"http://gateway.marvel.com/v1/public/comics/8500","name":"Deadpool (1997) #44"},{"resourceURI":"http://gateway.marvel.com/v1/public/comics/10223","name":"Marvel Premiere (1972) #35"},{"resourceURI":"http://gateway.marvel.com/v1/public/comics/10224","name":"Marvel Premiere (1972) #36"},{"resourceURI":"http://gateway.marvel.com/v1/public/comics/10225","name":"Marvel Premiere (1972) #37"}]
         * returned : 12
         */

        private int available;
        private String collectionURI;
        private int returned;
        private List<ComicsBean.ItemsBean> items;

        public int getAvailable() {
            return available;
        }

        public void setAvailable(int available) {
            this.available = available;
        }

        public String getCollectionURI() {
            return collectionURI;
        }

        public void setCollectionURI(String collectionURI) {
            this.collectionURI = collectionURI;
        }

        public int getReturned() {
            return returned;
        }

        public void setReturned(int returned) {
            this.returned = returned;
        }

        public List<ItemsBean> getItems() {
            return items;
        }

        public void setItems(List<ComicsBean.ItemsBean> items) {
            this.items = items;
        }

        public static class ItemsBean implements Serializable {
            /**
             * resourceURI : http://gateway.marvel.com/v1/public/comics/21366
             * name : Avengers: The Initiative (2007) #14
             */

            private String resourceURI;
            private String name;

            public String getResourceURI() {
                return resourceURI;
            }

            public void setResourceURI(String resourceURI) {
                this.resourceURI = resourceURI;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }
        }
    }

    public static class SeriesBean implements Serializable {
        /**
         * available : 3
         * collectionURI : http://gateway.marvel.com/v1/public/characters/1011334/series
         * items : [{"resourceURI":"http://gateway.marvel.com/v1/public/series/1945","name":"Avengers: The Initiative (2007 - 2010)"},{"resourceURI":"http://gateway.marvel.com/v1/public/series/2005","name":"Deadpool (1997 - 2002)"},{"resourceURI":"http://gateway.marvel.com/v1/public/series/2045","name":"Marvel Premiere (1972 - 1981)"}]
         * returned : 3
         */

        private int available;
        private String collectionURI;
        private int returned;
        private List<ItemsBeanX> items;

        public int getAvailable() {
            return available;
        }

        public void setAvailable(int available) {
            this.available = available;
        }

        public String getCollectionURI() {
            return collectionURI;
        }

        public void setCollectionURI(String collectionURI) {
            this.collectionURI = collectionURI;
        }

        public int getReturned() {
            return returned;
        }

        public void setReturned(int returned) {
            this.returned = returned;
        }

        public List<ItemsBeanX> getItems() {
            return items;
        }

        public void setItems(List<ItemsBeanX> items) {
            this.items = items;
        }

        public static class ItemsBeanX implements Serializable {
            /**
             * resourceURI : http://gateway.marvel.com/v1/public/series/1945
             * name : Avengers: The Initiative (2007 - 2010)
             */

            private String resourceURI;
            private String name;

            public String getResourceURI() {
                return resourceURI;
            }

            public void setResourceURI(String resourceURI) {
                this.resourceURI = resourceURI;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }
        }
    }

    public static class StoriesBean implements Serializable {
        /**
         * available : 21
         * collectionURI : http://gateway.marvel.com/v1/public/characters/1011334/stories
         * items : [{"resourceURI":"http://gateway.marvel.com/v1/public/stories/19947","name":"Cover #19947","type":"cover"},{"resourceURI":"http://gateway.marvel.com/v1/public/stories/19948","name":"The 3-D Man!","type":"interiorStory"},{"resourceURI":"http://gateway.marvel.com/v1/public/stories/19949","name":"Cover #19949","type":"cover"},{"resourceURI":"http://gateway.marvel.com/v1/public/stories/19950","name":"The Devil's Music!","type":"interiorStory"},{"resourceURI":"http://gateway.marvel.com/v1/public/stories/19951","name":"Cover #19951","type":"cover"},{"resourceURI":"http://gateway.marvel.com/v1/public/stories/19952","name":"Code-Name:  The Cold Warrior!","type":"interiorStory"},{"resourceURI":"http://gateway.marvel.com/v1/public/stories/47184","name":"AVENGERS: THE INITIATIVE (2007) #14","type":"cover"},{"resourceURI":"http://gateway.marvel.com/v1/public/stories/47185","name":"Avengers: The Initiative (2007) #14 - Int","type":"interiorStory"},{"resourceURI":"http://gateway.marvel.com/v1/public/stories/47498","name":"AVENGERS: THE INITIATIVE (2007) #15","type":"cover"},{"resourceURI":"http://gateway.marvel.com/v1/public/stories/47499","name":"Avengers: The Initiative (2007) #15 - Int","type":"interiorStory"},{"resourceURI":"http://gateway.marvel.com/v1/public/stories/47792","name":"AVENGERS: THE INITIATIVE (2007) #16","type":"cover"},{"resourceURI":"http://gateway.marvel.com/v1/public/stories/47793","name":"Avengers: The Initiative (2007) #16 - Int","type":"interiorStory"},{"resourceURI":"http://gateway.marvel.com/v1/public/stories/48361","name":"AVENGERS: THE INITIATIVE (2007) #17","type":"cover"},{"resourceURI":"http://gateway.marvel.com/v1/public/stories/48362","name":"Avengers: The Initiative (2007) #17 - Int","type":"interiorStory"},{"resourceURI":"http://gateway.marvel.com/v1/public/stories/49103","name":"AVENGERS: THE INITIATIVE (2007) #18","type":"cover"},{"resourceURI":"http://gateway.marvel.com/v1/public/stories/49104","name":"Avengers: The Initiative (2007) #18 - Int","type":"interiorStory"},{"resourceURI":"http://gateway.marvel.com/v1/public/stories/49106","name":"Avengers: The Initiative (2007) #18, Zombie Variant - Int","type":"interiorStory"},{"resourceURI":"http://gateway.marvel.com/v1/public/stories/49888","name":"AVENGERS: THE INITIATIVE (2007) #19","type":"cover"},{"resourceURI":"http://gateway.marvel.com/v1/public/stories/49889","name":"Avengers: The Initiative (2007) #19 - Int","type":"interiorStory"},{"resourceURI":"http://gateway.marvel.com/v1/public/stories/54371","name":"Avengers: The Initiative (2007) #14, Spotlight Variant - Int","type":"interiorStory"}]
         * returned : 20
         */

        private int available;
        private String collectionURI;
        private int returned;
        private List<ItemsBeanXX> items;

        public int getAvailable() {
            return available;
        }

        public void setAvailable(int available) {
            this.available = available;
        }

        public String getCollectionURI() {
            return collectionURI;
        }

        public void setCollectionURI(String collectionURI) {
            this.collectionURI = collectionURI;
        }

        public int getReturned() {
            return returned;
        }

        public void setReturned(int returned) {
            this.returned = returned;
        }

        public List<ItemsBeanXX> getItems() {
            return items;
        }

        public void setItems(List<ItemsBeanXX> items) {
            this.items = items;
        }

        public static class ItemsBeanXX implements Serializable {
            /**
             * resourceURI : http://gateway.marvel.com/v1/public/stories/19947
             * name : Cover #19947
             * type : cover
             */

            private String resourceURI;
            private String name;
            private String type;

            public String getResourceURI() {
                return resourceURI;
            }

            public void setResourceURI(String resourceURI) {
                this.resourceURI = resourceURI;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }
        }
    }

    public static class EventsBean implements Serializable {
        /**
         * available : 1
         * collectionURI : http://gateway.marvel.com/v1/public/characters/1011334/events
         * items : [{"resourceURI":"http://gateway.marvel.com/v1/public/events/269","name":"Secret Invasion"}]
         * returned : 1
         */

        private int available;
        private String collectionURI;
        private int returned;
        private List<ItemsBeanXXX> items;

        public int getAvailable() {
            return available;
        }

        public void setAvailable(int available) {
            this.available = available;
        }

        public String getCollectionURI() {
            return collectionURI;
        }

        public void setCollectionURI(String collectionURI) {
            this.collectionURI = collectionURI;
        }

        public int getReturned() {
            return returned;
        }

        public void setReturned(int returned) {
            this.returned = returned;
        }

        public List<ItemsBeanXXX> getItems() {
            return items;
        }

        public void setItems(List<ItemsBeanXXX> items) {
            this.items = items;
        }

        public static class ItemsBeanXXX implements Serializable{
            /**
             * resourceURI : http://gateway.marvel.com/v1/public/events/269
             * name : Secret Invasion
             */

            private String resourceURI;
            private String name;

            public String getResourceURI() {
                return resourceURI;
            }

            public void setResourceURI(String resourceURI) {
                this.resourceURI = resourceURI;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }
        }
    }

    public static class UrlsBean implements Serializable {
        /**
         * type : detail
         * url : http://marvel.com/characters/74/3-d_man?utm_campaign=apiRef&utm_source=7a4ee917fb53941ccc691445dac51ef7
         */

        private String type;
        private String url;

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }
    }
}
