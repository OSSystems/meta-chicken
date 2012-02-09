SECTION = "devel/chicken"
DESCRIPTION = "A more convenient HTTP library"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://intarweb.meta;md5=9e5ee287a3c060f363953d559dd2f22d"
DEPENDS_virtclass-cross += "chicken-egg-defstruct-cross chicken-egg-uri-common-cross chicken-egg-base64-cross chicken-egg-regex-cross"
DEPENDS += "chicken-egg-defstruct chicken-egg-uri-common chicken-egg-base64 chicken-egg-regex chicken-egg-defstruct-cross chicken-egg-uri-common-cross chicken-egg-base64-cross chicken-egg-regex-cross"
RDEPENDS += "chicken-egg-defstruct chicken-egg-uri-common chicken-egg-base64 chicken-egg-regex"

inherit chicken_install

BBCLASSEXTEND = "cross"
