SECTION = "devel/chicken"
DESCRIPTION = "Design by contract for procedures"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://simple-contracts.meta;md5=93f3917ec74e4b4e74d17a9f677291e0"
DEPENDS_append_class-cross = " chicken-egg-simple-exceptions-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-simple-exceptions-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-simple-exceptions chicken-egg-simple-exceptions-crosssdk"
DEPENDS = " chicken-egg-simple-exceptions chicken-egg-simple-exceptions-cross"
RDEPENDS_${PN} = " chicken-egg-simple-exceptions"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/simple-contracts/simple-contracts-${PV}.tar.gz"

SRC_URI[md5sum] = "1ccae12779ceb2a1b515dd824d9909cf"
SRC_URI[sha256sum] = "fbd75b57a5e0bb0537378e6566d874219679723dc0f136a5cca5eacccdda754f"

S = "${WORKDIR}/simple-contracts-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
