SECTION = "devel/chicken"
DESCRIPTION = "A tool to generate HTML ouput out of salmonella log files"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://salmonella-html-report.meta;md5=29e200fa75a3effe39bc567257f26af1"
DEPENDS_append_class-cross = " chicken-egg-sxml-transforms-cross chicken-egg-regex-cross chicken-egg-salmonella-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-sxml-transforms-crosssdk chicken-egg-regex-crosssdk chicken-egg-salmonella-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-sxml-transforms nativesdk-chicken-egg-regex nativesdk-chicken-egg-salmonella chicken-egg-sxml-transforms-crosssdk chicken-egg-regex-crosssdk chicken-egg-salmonella-crosssdk"
DEPENDS = " chicken-egg-sxml-transforms chicken-egg-regex chicken-egg-salmonella chicken-egg-sxml-transforms-cross chicken-egg-regex-cross chicken-egg-salmonella-cross"
RDEPENDS_${PN} = " chicken-egg-sxml-transforms chicken-egg-regex chicken-egg-salmonella"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/salmonella-html-report/salmonella-html-report-${PV}.tar.gz"

SRC_URI[md5sum] = "232181899519af729144c1f84777e004"
SRC_URI[sha256sum] = "f9228b7656dda41f9ef465a1a2c05bfba835e7c08b77a938c1c6cf2162830bb8"

S = "${WORKDIR}/salmonella-html-report-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
