SECTION = "devel/chicken"
DESCRIPTION = "Simple FTP client"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://ftp.meta;md5=1e588e26015759e586e820ad27001179"
DEPENDS_append_class-cross = " chicken-egg-matchable-cross chicken-egg-regex-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-matchable-crosssdk chicken-egg-regex-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-matchable nativesdk-chicken-egg-regex chicken-egg-matchable-crosssdk chicken-egg-regex-crosssdk"
DEPENDS = " chicken-egg-matchable chicken-egg-regex chicken-egg-matchable-cross chicken-egg-regex-cross"
RDEPENDS_${PN} = " chicken-egg-matchable chicken-egg-regex"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/ftp/ftp-${PV}.tar.gz"

SRC_URI[md5sum] = "de7154860d2fd91e3b5abe700aaedc2e"
SRC_URI[sha256sum] = "aa10870c481025531b2f2c156fddb9f365364152f65827e7c137d219fbc0a94b"

S = "${WORKDIR}/ftp-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
