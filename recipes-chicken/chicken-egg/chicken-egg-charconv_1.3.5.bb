SECTION = "devel/chicken"
DESCRIPTION = "Character encoding utilities"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://charconv.meta;md5=69b09c23804e74df2ebfe7997ee27cbf"
DEPENDS_virtclass-cross += "chicken-egg-iconv-cross chicken-egg-regex-cross"
DEPENDS += "chicken-egg-iconv chicken-egg-regex chicken-egg-iconv-cross chicken-egg-regex-cross"
RDEPENDS += "chicken-egg-iconv chicken-egg-regex"

inherit chicken_install

BBCLASSEXTEND = "cross"
