inherit chicken_install

SECTION = "devel/chicken"
DESCRIPTION = "Facilities for managing HTTP sessions"
DEPENDS_virtclass-cross += "chicken-cross chicken-egg-simple-sha1-cross chicken-egg-spiffy-cross chicken-egg-intarweb-cross chicken-egg-uri-common-cross"
DEPENDS += "chicken chicken-egg-simple-sha1 chicken-egg-spiffy chicken-egg-intarweb chicken-egg-uri-common chicken-egg-simple-sha1-cross chicken-egg-spiffy-cross chicken-egg-intarweb-cross chicken-egg-uri-common-cross"
RDEPENDS += "chicken-egg-simple-sha1 chicken-egg-spiffy chicken-egg-intarweb chicken-egg-uri-common"

BBCLASSEXTEND = "cross"

LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://http-session.meta;md5=a3b1df0688d5748db2739bb2a61b2e0d"
