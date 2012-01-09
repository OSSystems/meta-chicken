inherit chicken_install

SECTION = "devel/chicken"
DESCRIPTION = "Hygienic MATCH replacement"
DEPENDS_virtclass-cross += "chicken-cross"
DEPENDS += "chicken"

BBCLASSEXTEND = "cross"

LICENSE = "Public Domain"
LIC_FILES_CHKSUM = "file://matchable.meta;md5=3a6be0a7340eb32dbb69048656813be2"
