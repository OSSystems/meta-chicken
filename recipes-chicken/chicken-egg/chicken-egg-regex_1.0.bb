inherit chicken_install

SECTION = "devel/chicken"
DESCRIPTION = "Compatibility library for old regular expression API"
DEPENDS_virtclass-cross += "chicken-cross"
DEPENDS += "chicken"

BBCLASSEXTEND = "cross"

LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://regex.meta;md5=25746e98ba4372639dd4c9310e883dd0"
