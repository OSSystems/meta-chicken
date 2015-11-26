SECTION = "devel/chicken"
DESCRIPTION = "Remote Mailbox"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://remote-mailbox.meta;md5=add7045a0acf33f401546205ba87c071"
DEPENDS_append_class-cross = " chicken-egg-setup-helper-cross chicken-egg-tcp-server-cross chicken-egg-s11n-cross chicken-egg-mailbox-cross chicken-egg-miscmacros-cross chicken-egg-lookup-table-cross chicken-egg-check-errors-cross chicken-egg-synch-cross"
DEPENDS_append_class-crosssdk = " chicken-egg-setup-helper-crosssdk chicken-egg-tcp-server-crosssdk chicken-egg-s11n-crosssdk chicken-egg-mailbox-crosssdk chicken-egg-miscmacros-crosssdk chicken-egg-lookup-table-crosssdk chicken-egg-check-errors-crosssdk chicken-egg-synch-crosssdk"
DEPENDS_append_class-nativesdk = " nativesdk-chicken-egg-setup-helper nativesdk-chicken-egg-tcp-server nativesdk-chicken-egg-s11n nativesdk-chicken-egg-mailbox nativesdk-chicken-egg-miscmacros nativesdk-chicken-egg-lookup-table nativesdk-chicken-egg-check-errors nativesdk-chicken-egg-synch chicken-egg-setup-helper-crosssdk chicken-egg-tcp-server-crosssdk chicken-egg-s11n-crosssdk chicken-egg-mailbox-crosssdk chicken-egg-miscmacros-crosssdk chicken-egg-lookup-table-crosssdk chicken-egg-check-errors-crosssdk chicken-egg-synch-crosssdk"
DEPENDS = " chicken-egg-setup-helper chicken-egg-tcp-server chicken-egg-s11n chicken-egg-mailbox chicken-egg-miscmacros chicken-egg-lookup-table chicken-egg-check-errors chicken-egg-synch chicken-egg-setup-helper-cross chicken-egg-tcp-server-cross chicken-egg-s11n-cross chicken-egg-mailbox-cross chicken-egg-miscmacros-cross chicken-egg-lookup-table-cross chicken-egg-check-errors-cross chicken-egg-synch-cross chicken-egg-remote-mailbox-cross"
RDEPENDS_${PN} = " chicken-egg-setup-helper chicken-egg-tcp-server chicken-egg-s11n chicken-egg-mailbox chicken-egg-miscmacros chicken-egg-lookup-table chicken-egg-check-errors chicken-egg-synch"

SRC_URI = "http://code.call-cc.org/egg-tarballs/4/remote-mailbox/remote-mailbox-${PV}.tar.gz"

SRC_URI[md5sum] = "a8d977e5ac8757c903354561fb6cea04"
SRC_URI[sha256sum] = "fba89f56408e586c357b6df1034180fc7fcaa4a40dfde8cdec0bedfcec2b6a2a"

S = "${WORKDIR}/remote-mailbox-${PV}"

inherit chicken_install

BBCLASSEXTEND = "cross crosssdk nativesdk"
